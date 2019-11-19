package nika.tutorial.demo.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class PersonDAO {
    @Autowired
    private JdbcConnection jdbc;

    public JdbcConnection getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcConnection jdbc) {
        this.jdbc = jdbc;
    }
}
