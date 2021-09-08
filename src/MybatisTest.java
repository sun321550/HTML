import com.scy.bean.Person;

import com.scy.bean.Score;
import com.scy.bean.Teacher;
import com.scy.bean.dto.PersonDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MybatisTest {
    private SqlSession sqlSession;

    @Before //在@Test注解之前，执行的方法。提取重复的代码的。
    public void before() throws Exception {
        //加载并读取xml
        String path = "SqlMapConfig.xml";
        //import org.apache.ibatis.io.Resources;
        InputStream is = Resources.getResourceAsStream(path);
        //sql 链接的 工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSession = " + sqlSession);
        //sqlSession = org.apache.ibatis.session.defaults.DefaultSqlSession@6fc6f14e
        //sqlSession.close();
    }

    //全查
    @Test
    public void test01() {
        List<Person> personList = sqlSession.selectList("com.scy.dao.PersonDao.selectAll");
        for (Person person : personList) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }

    @Test
    public void test02() {
        List<Person> personList = sqlSession.selectList("com.scy.dao.PersonDao.selectPersonBySex", 2);
        for (Person person : personList) {
            System.out.println("person = " + person);
        }
        sqlSession.close();
    }

    //查总条数 这个主要学习的是 返回的数据类型 和上边的数据类型不一样
    @Test
    public void test03() {
        long o = sqlSession.selectOne("com.scy.dao.PersonDao.selectCount");
        System.out.println("o = " + o);
        sqlSession.close();
    }

    @Test
    public void test04() {
        Person person = new Person();
        person.setScore(100);
        person.setGender(2);

        long o = sqlSession.selectOne("com.scy.dao.PersonDao.selectCountByParam01", person);
        System.out.println("o = " + o);
        sqlSession.close();
    }

    //带参数查询 第二种 方式 map 传参 -- 多见于 多表查询
    @Test
    public void test05() throws ParseException {
        String date = "2020-10-14";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sf.parse(date);
        Map map = new HashMap();
        map.put("gender", 2);//key 一定要和 #{gender} 值保持一致
        map.put("birthday", birthday);
        List<Person> lists = sqlSession.selectList("com.scy.dao.PersonDao.selectCountByParam02", map);
        for (Person list : lists) {
            System.out.println("list = " + list);

        }
        sqlSession.close();
    }

    @Test
    public void test06() {
        List<Person> lists = sqlSession.selectList("com.scy.dao.PersonDao.selectCountByZi");
        for (Person list : lists) {
            System.out.println("list = " + list);

        }
        sqlSession.close();
    }

    //分组查询
    @Test
    public void test07() {
        List<PersonDTO> personDTOS = sqlSession.selectList("com.scy.dao.PersonDao.selectAvgScore");
        for (PersonDTO personDTO : personDTOS) {
            System.out.println("personDTO = " + personDTO);

        }
        sqlSession.close();
    }

    // <!--//分组查询 男生和女生的平均分值 大于200 的是什么 -->
    @Test
    public void test08() {
        List<PersonDTO> personDTOS = sqlSession.selectList("com.scy.dao.PersonDao.selectAvgScoreParam",200);
        for (PersonDTO personDTO : personDTOS) {
            System.out.println("personDTO = " + personDTO);


        }
        sqlSession.close();
    }
     //<!--用map 可以接收 任何的数据常见于多表-->
     @Test
     public void test09() {
         List<Map> maps = sqlSession.selectList("com.scy.dao.PersonDao.selectAvgScoreParam02", 200);
            for (Map map : maps){
                System.out.println("map = " + map);
            }
         sqlSession.close();
     }
     // 模糊 查询姓孙的

@Test
    public void  test10(){
        Map map = new HashMap();
        map.put("name","孙");

    List<Person> personList= sqlSession.selectList("com.scy.dao.PersonDao.selectPersonByLike", "孙");
   //因为$
    for (Person person : personList){
        System.out.println("person = " + person);

    }
    sqlSession.close();
}
//查询 可以用这个
    @Test
    public void  test11(){
        List<Person> personList = sqlSession.selectList("com.scy.dao.PersonDao.selectPersonByLike02", "孙");
        for (Person person : personList){
            System.out.println("person = " + person);

        }

        sqlSession.close();
    }
    @Test
    public void  test12(){
        List<Person> personList = sqlSession.selectList("com.scy.dao.PersonDao.selectPersonByLike03", "孙");
        for (Person person : personList){
            System.out.println("person = " + person);

        }

        sqlSession.close();
    }
    @Test
    public void test13() {
        Person person = new Person();
        person.setName("木易");
        person.setGender(2);
        person.setBirthday(new Date());
        person.setAddress("杭州");
        person.setScore(666);
        int insert = sqlSession.insert("com.yyh.dao.PersonDao.insertPerson", person);
        System.out.println("insert = " + insert);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void  test001(){
        Map map = new HashMap();
        map.put("gender", 2);//key 一定要和 #{gender} 值保持一致


         sqlSession.selectList("com.scy.bean.Person.select01",map);
    }
    @Test
    public  void  test1() {
        List<Score> lists = sqlSession.selectList("com.scy.dao.PersonDao.selectScore01",60);
        for (Score score : lists){
            System.out.println("score = " + score);

        }
        sqlSession.close();
    }
    @Test
    public  void  test2(){
        List<Teacher> lists = sqlSession.selectList("com.scy.dao.PersonDao.selectTeacher", "李");
        for (Teacher teacher : lists){
            System.out.println("teacher = " + teacher);

        }
        sqlSession.close();

    }
    @Test
    public void test0001(){
        Map map=new HashMap();
        map.put("c_id1","01");
        map.put("c_id2","02");
        List<Map> ss=sqlSession.selectList("com.scy.dao.PersonDao.select02",map);
        for (Map s : ss) {
            System.out.println("s = " + s);
        }
        sqlSession.close();
    }
@Test
    public void test0002(){
    List<Map> ss = sqlSession.selectList("com.scy.dao.PersonDao.select03", 60);
    for (Map map : ss){
        System.out.println("map = " + map);

    }
    sqlSession.close();
}
@Test
    public void test0003(){
    List<Map> ss = sqlSession.selectList("com.scy.dao.PersonDao.select04", 60);
for (Map map : ss){
    System.out.println("map = " + map);
}
sqlSession.close();
}
    @Test
    public void test0004(){
        List<Map> ss=sqlSession.selectList("com.hp.dao.PersonDao.select04",60);
        for (Map s : ss) {
            System.out.println("s = " + s);
        }
        sqlSession.close();
    }

    @Test
    public void test0005(){
        List<Map> ss=sqlSession.selectList("com.scy.dao.PersonDao.select05");
        for (Map s : ss) {
            System.out.println("s = " + s);
        }
        sqlSession.close();
    }

    @Test
    public void test0006(){
        Integer ss=sqlSession.selectOne("com.scy.dao.PersonDao.select06","李");
        System.out.println("ss = " + ss);
        sqlSession.close();
    }

    @Test
    public void test0007(){
        List<Map> ss=sqlSession.selectList("com.scy.dao.PersonDao.select07","张三");
        for (Map s : ss) {
            System.out.println("s = " + s);
        }
        sqlSession.close();
    }

    @Test
    public void test0008(){
        List<Map> ss=sqlSession.selectList("com.scy.dao.PersonDao.select08","张三");
        for (Map s : ss) {
            System.out.println("s = " + s);
        }
        sqlSession.close();
    }

@Test
    public void test111(){
    int o = sqlSession.delete("com.scy.dao.PersonDao.deletePersonById", 16);
    System.out.println("o = " + o);

    sqlSession.commit();
    sqlSession.close();

}
//<!--动态SQL 重点 难点 也是高薪的起点-->
    //动态SQL 其实就是 让达到一条 xml 中的语句可以实现N多种查询。
    //那么  要实现多种查询 就有一个硬性的条件 ，你的参数要多  参数要多1.放弃单个的属性（int string ）改用实体类2.参数改用map
    //今天所学的推翻昨天所学的  那么就需要 总结昨天所学的
    //第一类 特征 1返回值 正常表的结果集 对应的是 person 实体类
    // 2 都是 select * from person 开头的
    //1.1 select * from person
    //1.2 select * from person where gender = 2
    //1.3 select * from person where gender=#igender} and birthday>=#{birthday}
    //1.4 select * . from person . .where name .like. . "%"#{name} "%"
    //1-4 可以 合N为一 只需要吧 where 后面的参数做个 if 判断

//    第二种 特征1 返回值  一个数单行单列 菲 person 实体类 是一个数据类型
//    2 都是select count（*） from person 开头的
    //2。1select count（*） from person
    //2.2select count（*） from person where gender=2 and score>100


    // 综上所述 以上SQL 可以 进行动态 判断 形成一个 SQL ！1 这就叫动态 SQL





//动态查询test15(之前废了
@Test
public void test15() {
    Person person = new Person();
    //null就是全查
    //person.setId(16); //select * from person p WHERE p.id=?
    person.setScore(200);
    person.setGender(2);
    List<Person> personList = sqlSession.selectList("com.scy.dao.PersonDao.dongTaiSelect", person);
    for (Person person1 : personList) {
        System.out.println("person1 = " + person1);
    }
    sqlSession.commit();
    sqlSession.close();
}

//动态修改  其实就是 有选择性 的修改 多个字段  比如所以女孩子分数  日期 等
@Test
    public void  test16(){
    Person person = new Person();
    person.setId(16);
    person.setAddress("美国");
    person.setBirthday(new Date());
    int update = sqlSession.update("com.scy.dao.PersonDao.dongTaiUpdate",person);
    System.out.println("update = " + update);
    sqlSession.commit();
    sqlSession.close();

}
//批量删除  dele xx  in (1,2,3,5,4)
//    构造一个ids  （1,2,3,4）
@Test
    public  void  test17(){
        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        Map map = new HashMap();
        map.put("ids",idList);
    int delete = sqlSession.delete("com.scy.dao.PersonDao.piLingDel", map);
    System.out.println("delete = " + delete);
    sqlSession.commit();
    sqlSession.close();
}
//以上代码 不用手写 谁写谁垃圾
//    以上的xml代码都是生成的 不需要你写   DAO 不需要你写
//    但是你得知道  你得能看懂

}

