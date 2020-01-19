package net.devstudy.resume.service;


import net.devstudy.resume.entity.Profile;

public interface AddProfileService {

    Profile createNewProfile(String firstName, String lastName,String uid,String password);

}
