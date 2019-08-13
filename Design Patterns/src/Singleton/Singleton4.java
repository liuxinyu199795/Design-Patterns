package Singleton;

/**
 * @ProjectName: sheJiMoShi
 * @Package: Singleton
 * @ClassName: Singleton4
 * @Author: XinyuLiu
 * @Date: 2019/8/13 10:53
 * 双重校验锁-线程安全
 * 意义：uniqueInstance 只需要被实例化一次，之后就可以直接使用了。
 * 加锁操作只需要对实例化那部分的代码进行，只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
 * 双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。
 */
public class Singleton4 {
    private static Singleton4 uniqueInstance;

    private Singleton4(){

    }
    private static Singleton4 getSingleton(){
        if(uniqueInstance==null){
            synchronized (Singleton4.class){  //类锁，一个类只有一个对象能够进去
                if(uniqueInstance==null){
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
