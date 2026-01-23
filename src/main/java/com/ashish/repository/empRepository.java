package com.ashish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashish.entity.Emp;
@Repository
public interface empRepository extends JpaRepository<Emp,Integer> {

}
