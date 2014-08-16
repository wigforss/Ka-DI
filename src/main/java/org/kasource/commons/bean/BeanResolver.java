package org.kasource.commons.bean;

import java.lang.annotation.Annotation;
import java.util.Set;


/**
 * Generic Bean Resolver, which resolves beans from a Bean Context by name, type and
 * qualifiers.
 * 
 * @author rikardwi
 **/
public interface BeanResolver {
    
    /**
     * Returns the bean with matching name and type.
     * 
     * @param <T> Type of the bean to locate, may be Object if class is unknown.
     * @param beanName Name of bean to locate
     * @param ofType   Class of bean to locate
     *  
     * @return The bean found with matching name and type.
     * 
     * @throws BeanNotFoundException If no such bean can be found.
     **/
    public <T> T getBean(String beanName, Class<T> ofType) throws BeanNotFoundException;
    
    /**
     * Returns all beans found with matching ofType
     * 
     * @param <T>        Type of the beans to locate, may be Object if class is unknown.
     * @param ofType     Class of beans to locate.
     * 
     * @return Set of matching beans found or empty set if no such beans was found.
     **/
    public <T> Set<T> getBeans(Class<T> ofType);
    
    /**
     * Returns all beans found with matching ofType class and optional Qualifier annotations.
     * 
     * @param <T>        Type of the beans to locate, may be Object if class is unknown.
     * @param ofType     Class of beans to locate.
     * @param qualifiers Optional Qualifiers.
     * 
     * @return Set of matching beans found or empty set if no such beans was found.
     **/
    public <T> Set<T> getBeansByQualifier(Class<T> ofType, Class<? extends Annotation>...qualifiers);
    
    /**
     * Returns all beans found with matching ofType class and optional Qualifier annotations.
     * 
     * @param <T>         Type of the beans to locate, may be Object if class is unknown.
     * @param ofType      Class of beans to locate.
     * @param qualifiers  Optional Qualifiers.
     * 
     * @return Set of matching beans found or empty set if no such beans was found.
     */
    public <T> Set<T> getBeansByQualifier(Class<T> ofType, Annotation...qualifiers);
}
