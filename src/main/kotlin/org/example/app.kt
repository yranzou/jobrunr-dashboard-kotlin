package org.example

import org.h2.jdbcx.JdbcDataSource
import org.jobrunr.configuration.JobRunr
import org.jobrunr.storage.sql.h2.H2StorageProvider

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val source = JdbcDataSource();
            source.setURL("jdbc:h2:/tmp/test");
            source.user = "sa";
            source.password = "sa";

            val scheduler = JobRunr.configure()
                .useStorageProvider(H2StorageProvider(source))
                .useDashboard()
                .initialize()
        }
    }
}