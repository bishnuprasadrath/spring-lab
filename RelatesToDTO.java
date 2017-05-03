/**
 * 
 */
package com.bishnu;

import java.util.List;


/**
 * 
 * @author Bishnu.rath
 *
 */
public class RelatesToDTO {

  /**
   * Id of RelatesTo entity.
   */
  private String id;

  /**
   * type of RelatesTo entity.
   */
  private String type;
  
  private List<String> relatesType;
  
  private List<Double> doublerelatesType;

  /**
   * @return the id
   */
  public final String getId() {
    return id;
  }

  /**
   * @param id
   *          the id to set
   */
  public final void setId(String id) {
    this.id = id;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * @return the relatesType
   */
  public List<String> getRelatesType() {
    return relatesType;
  }

  /**
   * @param relatesType the relatesType to set
   */
  public void setRelatesType(List<String> relatesType) {
    this.relatesType = relatesType;
  }

  /**
   * @return the doublerelatesType
   */
  public List<Double> getDoublerelatesType() {
    return doublerelatesType;
  }

  /**
   * @param doublerelatesType the doublerelatesType to set
   */
  public void setDoublerelatesType(List<Double> doublerelatesType) {
    this.doublerelatesType = doublerelatesType;
  }
  
}
