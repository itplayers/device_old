package com.itplayer.core.system.query;

import com.itplayer.core.base.page.QueryModel;
import com.itplayer.core.base.utils.StrUtils;
import com.itplayer.core.system.entity.Manager;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class ManagerQueryModel extends QueryModel<Manager> {
    private Manager manager;

    public ExampleMatcher buildMatcher() {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        boolean allIsNull = true;
        if (StrUtils.isNotNull(manager.getRealName())) {
            allIsNull = false;
            exampleMatcher = ExampleMatcher.matching().withMatcher("realName", ExampleMatcher.GenericPropertyMatchers.contains());
        }
        if (allIsNull) {
            return super.buildMatcher();
        }
        return exampleMatcher;
    }


    public Example<Manager> buildExample() {
        Example<Manager> example = Example.of(manager, buildMatcher());
        return example;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
