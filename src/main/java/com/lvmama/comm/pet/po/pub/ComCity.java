package com.lvmama.comm.pet.po.pub;

import java.io.Serializable;

public class ComCity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -446673258938026282L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column COM_CITY.CITY_ID
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    private String cityId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column COM_CITY.CITY_NAME
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    private String cityName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column COM_CITY.PROVINCE_ID
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    private String provinceId;

    private String checked;
    
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column COM_CITY.CITY_ID
     *
     * @return the value of COM_CITY.CITY_ID
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column COM_CITY.CITY_ID
     *
     * @param cityId the value for COM_CITY.CITY_ID
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column COM_CITY.CITY_NAME
     *
     * @return the value of COM_CITY.CITY_NAME
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column COM_CITY.CITY_NAME
     *
     * @param cityName the value for COM_CITY.CITY_NAME
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column COM_CITY.PROVINCE_ID
     *
     * @return the value of COM_CITY.PROVINCE_ID
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column COM_CITY.PROVINCE_ID
     *
     * @param provinceId the value for COM_CITY.PROVINCE_ID
     *
     * @ibatorgenerated Tue Apr 20 11:55:56 CST 2010
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}
}