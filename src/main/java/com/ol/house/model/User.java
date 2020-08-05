package com.ol.house.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.id
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.username
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.password
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.salt
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.gmt_create
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.gmt_modified
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user.is_admin
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    private Integer isAdmin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.id
     *
     * @return the value of s_user.id
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.id
     *
     * @param id the value for s_user.id
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.username
     *
     * @return the value of s_user.username
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.username
     *
     * @param username the value for s_user.username
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.password
     *
     * @return the value of s_user.password
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.password
     *
     * @param password the value for s_user.password
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.salt
     *
     * @return the value of s_user.salt
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.salt
     *
     * @param salt the value for s_user.salt
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.gmt_create
     *
     * @return the value of s_user.gmt_create
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.gmt_create
     *
     * @param gmtCreate the value for s_user.gmt_create
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.gmt_modified
     *
     * @return the value of s_user.gmt_modified
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.gmt_modified
     *
     * @param gmtModified the value for s_user.gmt_modified
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user.is_admin
     *
     * @return the value of s_user.is_admin
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public Integer getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user.is_admin
     *
     * @param isAdmin the value for s_user.is_admin
     *
     * @mbg.generated Wed Aug 05 17:02:03 CST 2020
     */
    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }
}