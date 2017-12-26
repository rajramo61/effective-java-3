package org.rajesh.objcreation.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * This is abstract builder class and can be extended for a concrete builder
 * Item 2: Consider a builder when faced with many constructor parameters
 */
public abstract class Developer {
    private Set<TechSkills> skills;

    public static abstract class Builder<T extends Builder<T>>{
        EnumSet<TechSkills> skills = EnumSet.noneOf(TechSkills.class);

        public T addSkill(TechSkills skill){
            skills.add(Objects.requireNonNull(skill, "Tech skills can not be null for a developer"));
            return self();
        }

        public abstract Developer build();
        protected abstract T self();
    }

    Developer(Builder<?> builder){
        this.skills = builder.skills.clone();
    }
}
