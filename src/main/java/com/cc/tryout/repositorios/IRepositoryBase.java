package com.cc.tryout.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.cc.tryout.entidades.AbstractBaseEntity;

@NoRepositoryBean
public abstract interface IRepositoryBase<T extends AbstractBaseEntity, ID extends Integer> extends JpaRepository<T,ID>{

}
