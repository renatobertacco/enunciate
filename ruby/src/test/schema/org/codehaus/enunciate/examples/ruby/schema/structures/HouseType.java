package org.codehaus.enunciate.examples.ruby.schema.structures;

import org.codehaus.enunciate.qname.XmlQNameEnum;
import org.codehaus.enunciate.qname.XmlUnknownQNameEnumValue;

/**
 * @author Ryan Heaton
 */
@XmlQNameEnum
public enum HouseType {

  brick,

  wood,

  mud,

  @XmlUnknownQNameEnumValue
  unknown
}
