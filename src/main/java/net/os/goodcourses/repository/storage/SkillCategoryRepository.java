package net.os.goodcourses.repository.storage;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.RepositoryDefinition;

import net.os.goodcourses.entity.SkillCategory;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
@RepositoryDefinition(domainClass=SkillCategory.class, idClass=Long.class)
public interface SkillCategoryRepository {

	List<SkillCategory> findAll(Sort sort);
}
