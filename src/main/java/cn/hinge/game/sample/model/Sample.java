package cn.hinge.game.sample.model;

public class Sample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ssm_sample.id
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ssm_sample.name
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ssm_sample.age
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ssm_sample.id
     *
     * @return the value of ssm_sample.id
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ssm_sample.id
     *
     * @param id the value for ssm_sample.id
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ssm_sample.name
     *
     * @return the value of ssm_sample.name
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ssm_sample.name
     *
     * @param name the value for ssm_sample.name
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ssm_sample.age
     *
     * @return the value of ssm_sample.age
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ssm_sample.age
     *
     * @param age the value for ssm_sample.age
     *
     * @mbggenerated Thu May 07 17:41:40 CST 2015
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}