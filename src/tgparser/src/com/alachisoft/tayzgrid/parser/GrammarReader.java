/* This software is provided 'as-is', without any expressed or implied warranty. In no event will the author(s) be held liable for any damages arising from the use of this software.
*Permission is granted to anyone to use this software for any purpose. If you use this software in a product, an acknowledgment in the product documentation would be deeply appreciated but is not required.

*In the case of the GOLD Parser Engine source code, permission is granted to anyone to alter it and redistribute it freely, subject to the following restrictions:

*	1. The origin of this software must not be misrepresented; you must not claim that you wrote the original software.
*	2.	Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
*	3.	This notice may not be removed or altered from any source distribution
*/


package com.alachisoft.tayzgrid.parser;

import java.io.*;
import java.nio.charset.Charset;
// C# Translation of GoldParser, by Marcus Klimstra <klimstra@home.nl>.
// Based on GOLDParser by Devin Cook <http://www.devincook.com/goldparser>.

/**
 * This class is used to read information stored in the very simple file structure used by the Compiled Grammar Table file.
 */
public class GrammarReader
{

    private static final String c_filetype = "G O L D   P a r s e r   T a b l e s / v 1 . 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ";
    //private Encoding m_encoding;
    private BufferedInputStream m_reader;
    private java.util.LinkedList m_entryQueue;

    /*
     * constructor
     */
    public GrammarReader(String p_filename) throws IOException
    {
        try
        {
            //m_encoding = new UnicodeEncoding(false, true);
            m_reader = new BufferedInputStream(new FileInputStream(p_filename));
            m_entryQueue = new java.util.LinkedList();
        }
        catch (Exception e)
        {
            throw new com.alachisoft.tayzgrid.parser.ParserException("Error constructing GrammarReader");
        }

        if (!HasValidHeader())
        {
            throw new com.alachisoft.tayzgrid.parser.ParserException("Incorrect file header");
        }
    }

    public GrammarReader(InputStream stream) throws IOException
    {
        try
        {
            //m_encoding = new UnicodeEncoding(false, true);
            m_reader = new BufferedInputStream(stream);
            m_entryQueue = new java.util.LinkedList();
        }
        catch (Exception e)
        {
            throw new com.alachisoft.tayzgrid.parser.ParserException("Error constructing GrammarReader");
        }

        if (!HasValidHeader())
        {
            throw new com.alachisoft.tayzgrid.parser.ParserException("Incorrect file header");
        }
    }

    /*
     * public methods
     */
    public final boolean MoveNext()
    {
        try
        {
            EntryContent content = EntryContent.forValue(m_reader.read());
            //EntryContent content = (EntryContent)m_reader.read();
            if (content == EntryContent.Multi)
            {
                m_entryQueue.clear();
                byte[] buffer=new byte[2];
                m_reader.read(buffer);
                int count = buffer[0];
                for (int n = 0; n < count; n++)
                {
                    ReadEntry();
                }

                return true;
            }
            else
            {
                return false;
            }
        }
        catch (java.io.IOException e)
        {
            return false;
        }
    }

    public final Object RetrieveNext()
    {
        if (m_entryQueue.isEmpty())
        {
            return null;
        }
        else
        {
            return m_entryQueue.poll();
        }
    }

    public final boolean RetrieveDone()
    {
        return (m_entryQueue.isEmpty());
    }

    /*
     * private methods
     */
    private boolean HasValidHeader() throws IOException
    {
        String filetype = ReadString();
        return filetype.equals(c_filetype);
    }

    private String ReadString() throws IOException
    {
        int pos = 0;
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte[] buffer = new byte[1024];
        byte[] buffer = new byte[1024];

        while (true)
        {
            m_reader.read(buffer, pos, 2);
            if (buffer[pos] == 0)
            {
                break;
            }
            pos = pos + 2;
        }
        //return "UTF-8";
        return new String(buffer, 0, buffer.length, Charset.forName("UTF-8"));
        //return "GOLD Parser Tables/v1.0";
    }

    private void ReadEntry() throws IOException
    {
        EntryContent content = EntryContent.forValue(m_reader.read());
        switch (content)
        {
            case Empty:
                m_entryQueue.offer(new Object());
                break;
            case Boolean:
                boolean boolvalue = (m_reader.read() == 1);
                m_entryQueue.offer(boolvalue);
                break;
            case Byte:
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: byte bytevalue = m_reader.ReadByte();
                byte bytevalue = (byte) m_reader.read();
                m_entryQueue.offer(bytevalue);
                break;
            case Integer:
                //short intvalue = (short) m_reader.read();
                byte[] buffer=new byte[2];
                m_reader.read(buffer);
                short intvalue=(short)(((buffer[1]&0xFF)<<8) |  buffer[0]&0xFF);//buffer[0];
                m_entryQueue.offer(intvalue);
                break;
            case String:
                String strvalue = ReadString();
                m_entryQueue.offer(strvalue);
                break;
            default:
                throw new ParserException("Error reading CGT: unknown entry-content type");
        }
    }
}
