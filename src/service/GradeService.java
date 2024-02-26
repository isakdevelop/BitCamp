package service;

import model.SubjectDTO;

public interface GradeService {
    public int total(SubjectDTO student);

    public double Avg(int total);
}
