/**
 * 
 */
package com.internsearchapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.internsearchapi.repository.LinkRepository;
import com.internsearchapi.vo.Link;

/**
 * @author ravitejakommalapati
 *
 */
@RestController
public class LinkController {

	@Autowired
	private LinkRepository linkRepository;
	
	@GetMapping("/links")
	public List<Link> retrieveAllStudents() {
		return linkRepository.findAll();
	}
	
	@GetMapping("/links/{companyName}")
	public Link retrieveStudent(@PathVariable String companyName) {
		Optional<Link> link = linkRepository.findById(companyName);

		if (!link.isPresent())
			System.out.println("No Link Found");

		return link.get();
	}
	@DeleteMapping("/links/{companyName}")
	public void deleteStudent(@PathVariable String id) {
		linkRepository.deleteById(id);
	}
	@PostMapping("/links")
	public Link createStudent(@RequestBody Link link) {
		Link savedlink = linkRepository.save(link);
		return savedlink;
	}
	@PutMapping("/links/{companyName}")
	public Link updateStudent(@RequestBody Link link, @PathVariable String companyName) {

		Optional<Link> studentOptional = linkRepository.findById(companyName);

		if (!studentOptional.isPresent())
			System.out.println("Link not available");

		link.setCompanyName(companyName);		
		Link updatedLink=linkRepository.save(link);

		return updatedLink;
	}
}
