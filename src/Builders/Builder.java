package Builders;

import Domain.Gender;

import java.util.List;

public interface Builder {
    void setName(String n);
    void setGender(Gender g);
    void setPhysicalAttributes(List<Object> pa);
    void setCredit(int c);
    void setForce(int f);
    void setDexterity(int d);
    void setIntelligence(int i);
    void setEndurance(int e);
    void setSpeed(int s);
    void setConstitution(int c);
}
