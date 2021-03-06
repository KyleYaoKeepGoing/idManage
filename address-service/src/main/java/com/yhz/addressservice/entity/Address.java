package com.yhz.addressservice.entity;

public class Address {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idm_address.id
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idm_address.id_id
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    private Integer idId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idm_address.name
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idm_address.address
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column idm_address.is_deleted
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    private Byte isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idm_address.id
     *
     * @return the value of idm_address.id
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idm_address.id
     *
     * @param id the value for idm_address.id
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idm_address.id_id
     *
     * @return the value of idm_address.id_id
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public Integer getIdId() {
        return idId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idm_address.id_id
     *
     * @param idId the value for idm_address.id_id
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public void setIdId(Integer idId) {
        this.idId = idId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idm_address.name
     *
     * @return the value of idm_address.name
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idm_address.name
     *
     * @param name the value for idm_address.name
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idm_address.address
     *
     * @return the value of idm_address.address
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idm_address.address
     *
     * @param address the value for idm_address.address
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column idm_address.is_deleted
     *
     * @return the value of idm_address.is_deleted
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column idm_address.is_deleted
     *
     * @param isDeleted the value for idm_address.is_deleted
     *
     * @mbggenerated Sun May 10 20:11:04 CST 2020
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}