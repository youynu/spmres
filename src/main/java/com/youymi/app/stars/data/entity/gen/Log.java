package com.youymi.app.stars.data.entity.gen;

import java.util.Date;

public class Log {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.log_date
     *
     * @mbggenerated
     */
    private Date logDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_log.note
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.id
     *
     * @return the value of t_log.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.id
     *
     * @param id the value for t_log.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.user_id
     *
     * @return the value of t_log.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.user_id
     *
     * @param userId the value for t_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.user_name
     *
     * @return the value of t_log.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.user_name
     *
     * @param userName the value for t_log.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.log_date
     *
     * @return the value of t_log.log_date
     *
     * @mbggenerated
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.log_date
     *
     * @param logDate the value for t_log.log_date
     *
     * @mbggenerated
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_log.note
     *
     * @return the value of t_log.note
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_log.note
     *
     * @param note the value for t_log.note
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}