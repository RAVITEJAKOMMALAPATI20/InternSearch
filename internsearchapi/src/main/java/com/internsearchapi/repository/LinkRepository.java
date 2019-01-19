/**
 * 
 */
package com.internsearchapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internsearchapi.vo.Link;

/**
 * @author ravitejakommalapati
 *
 */

@Repository
public interface LinkRepository extends JpaRepository<Link, String> {

}
