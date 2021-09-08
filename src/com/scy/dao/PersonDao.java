package com.scy.dao;

import com.scy.bean.Person;
import com.scy.bean.Score;
import com.scy.bean.Student;
import com.scy.bean.Teacher;
import com.scy.bean.dto.PersonDTO;

import java.util.List;
import java.util.Map;

public interface PersonDao {
    //全查
    List<Person> selectAll();
    //根据性别查询
    List<Person> selectPersonBySex(int sex);
    //查询总条数
    long selectCount();
    //查询总调数 加 多个参数 第一种方式 2个参数丢失person 类中的属性 所以直接可以吧 person当做参数
    //实体类做参数
    long selectCountByParam01(Person person);
    //查性别和生日 当查出的SQL 语句不确定是唯一的一条的时候 一定 用 list
    //当多表联查的时候 请求的参数一定要为 map 或者是 自己写个 实体类 应用场景多表联查的参数查询
    List<Person> selectCountByParam02(Map map);
    List<Person> selectCountByZi(Map map);

//    分组查询
    List<PersonDTO> selectAvgScore();
    // <!--//分组查询 男生和女生的平均分值 大于200 的是什么 -->
    List<PersonDTO> selectAvgScoreParam(int score);
    // <!--//分组查询 男生和女生的平均分值 大于200 的是什么  有什么参数-->
    List<Map> selectAvgScoreParam02(int score);
//第一种
    List<Person> selectPersonByLike(String name);
//第二种
    List<Person> selectPersonByLike02(String name);
    //第三种
    List<Person> selectPersonByLike03(String name);
    //增加的方法
    int insertPerson(Person person);

    List<Score> selectScoer01(int score);

    List<Teacher> selectTeacher(String name);

    List<Student> selectStudent(int score);

    List<Map> select02(Map map);

    List<Map> select03(int s_score);
    List<Map> select04(int s_score);


    List<Map> select05();

    Integer select06(String t_name);

    List<Map> select07(String t_name);

    List<Map> select08(String t_name);




//删除一条数据
    int deletePersonById(Integer id);//注意：之后讲解 动态SQL 那么我们
    //的dao 层接口中 只有 基础类型 int string 不好的 不方便执行动态SQL 对以后写代码扩展 不方便
    //以后 自己写代码 参数一定是 一个实体类或者是 map 或者是DTO

//动态 SQL
    List<Person> dongTaiSelect(Person person);//动态的SQL  如果不是 参数实体类 不是集合是空参数 那毫无意义
    //长成 返回值是 List<实体类> 参数 也是同样 的实体类 那么这是一个典型的 动态SQL 语句
//动态修改
    int dongTaiUpdate(Person person);

    //批量删除
    void piLingDel(Map map);


}

