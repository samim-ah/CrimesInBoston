package com.samhad.driver;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class BySeasonApp extends Configured implements Tool {

    public static void main(String[] args) {

        try {
            int res = ToolRunner.run(new Configuration(), new ByTimeApp(), args);
            System.exit(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public int run(String[] args) throws Exception {
        return 0;
    }
}
