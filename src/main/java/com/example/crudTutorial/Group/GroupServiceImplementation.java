package com.example.crudTutorial.Group;

import com.example.crudTutorial.Employee.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupServiceImplementation implements GroupService {

    @Autowired
    private final GroupRepository groupRepository;

    @Override
    public Group save(Group group) {
            return groupRepository.save(group);
    }
}
