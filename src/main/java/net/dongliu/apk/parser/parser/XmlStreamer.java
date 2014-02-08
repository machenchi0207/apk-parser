package net.dongliu.apk.parser.parser;

import net.dongliu.apk.parser.struct.xml.*;

/**
 * callback interface for parse binary xml file.
 *
 * @author dongliu
 */
public interface XmlStreamer {

    void onStartTag(XmlNodeStartTag xmlNodeStartTag);

    void onEndTag(XmlNodeEndTag xmlNodeEndTag);

    void onAttribute(Attribute attribute);

    void onCData(XmlCData xmlCData);

    void onNamespace(XmlNamespaceStartTag namespace);
}
