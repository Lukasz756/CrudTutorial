package com.example.crudTutorial.Branch;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor

@Service
public class BranchServiceImplementation implements BranchService {
    @Autowired
    private final BranchRepository branchRepository;

    @Override
    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }
}
