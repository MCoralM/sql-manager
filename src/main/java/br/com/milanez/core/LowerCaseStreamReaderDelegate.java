package br.com.milanez.core;

import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

/**
 *
 * @author moises
 */
public class LowerCaseStreamReaderDelegate extends StreamReaderDelegate {

    public LowerCaseStreamReaderDelegate(XMLStreamReader xsr) {
        super(xsr);
    }

    @Override
    public String getAttributeLocalName(int index) {
        return super.getAttributeLocalName(index).toLowerCase();
    }

    @Override
    public String getLocalName() {
        return super.getLocalName().toLowerCase();
    }

}
