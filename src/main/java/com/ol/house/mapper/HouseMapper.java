package com.ol.house.mapper;

import com.ol.house.model.House;
import com.ol.house.model.HouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    long countByExample(HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int deleteByExample(HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int insert(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int insertSelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    List<House> selectByExampleWithRowbounds(HouseExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    List<House> selectByExample(HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    House selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int updateByPrimaryKeySelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_info
     *
     * @mbg.generated Thu Aug 06 11:12:14 CST 2020
     */
    int updateByPrimaryKey(House record);
}