
package com.seeyon.apps.babi.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Read_HKZF_DataResponse", namespace = "http://service.babi.apps.seeyon.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Read_HKZF_DataResponse", namespace = "http://service.babi.apps.seeyon.com/")
public class Read_HKZF_DataResponse {

    @XmlElement(name = "return", namespace = "")
    private com.seeyon.apps.babi.pojo.StateMessage _return;

    /**
     * 
     * @return
     *     returns StateMessage
     */
    public com.seeyon.apps.babi.pojo.StateMessage getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.seeyon.apps.babi.pojo.StateMessage _return) {
        this._return = _return;
    }

}
