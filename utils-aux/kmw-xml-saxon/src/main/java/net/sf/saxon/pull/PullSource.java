package net.sf.saxon.pull;

import javax.xml.transform.Source;

/**
 * A PullSource is a JAXP Source that encapsulates a PullProvider - that is, an object
 * that supplies an XML document as a sequence of events that are read under the control
 * of the recipient. Note that although PullSource implements the JAXP Source interface,
 * it is not necessarily acceptable to every JAXP implementation that accepts a Source
 * as input: Source is essentially a marker interface and users of Source objects need
 * to understand the individual implementation.
 */

public class PullSource implements Source {

    private String systemId;
    private PullProvider provider;

    /**
     * Create a PullSource based on a supplied PullProvider
     * @param provider the underlying PullProvider
     */

    public PullSource(PullProvider provider) {
        this.provider = provider;
        if (provider.getSourceLocator() != null) {
            systemId = provider.getSourceLocator().getSystemId();
        }
    }

    /**
     * Get the PullProvider
     * @return the underlying PullProvider
     */

    public PullProvider getPullProvider() {
        return provider;
    }

    /**
     * Set the system identifier for this Source.
     *
     * <p>The system identifier is optional if the source does not
     * get its data from a URL, but it may still be useful to provide one.
     * The application can use a system identifier, for example, to resolve
     * relative URIs and to include in error messages and warnings.</p>
     *
     * @param systemId The system identifier as a URL string.
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * Get the system identifier that was set with setSystemId.
     *
     * @return The system identifier that was set with setSystemId, or null
     *         if setSystemId was not called.
     */
    public String getSystemId() {
        return systemId;
    }
}

//
// The contents of this file are subject to the Mozilla Public License Version 1.0 (the "License");
// you may not use this file except in compliance with the License. You may obtain a copy of the
// License at http://www.mozilla.org/MPL/
//
// Software distributed under the License is distributed on an "AS IS" basis,
// WITHOUT WARRANTY OF ANY KIND, either express or implied.
// See the License for the specific language governing rights and limitations under the License.
//
// The Original Code is: all this file
//
// The Initial Developer of the Original Code is Michael H. Kay.
//
// Contributor(s):
//

