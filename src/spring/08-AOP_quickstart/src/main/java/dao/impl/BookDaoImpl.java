package dao.impl;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
//        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
        //心程广当前放行放厅（开始时间
        Long startTime =System.currentTimeMillis();
        //业务执行万M
        for(int i=0;i<16888;i++){
                System.out.println("book dao save...");
        }
        Long endTime =System.currentTimeMillis();
        Long totalTime=endTime-startTime;
        System.out.println("执行万次消耗时问："+totalTime+"ms");
    }

    public void update(){
        System.out.println("book dao update ...");
    }

    public void select(){
        System.out.println("book dao select ...");
    }
}
