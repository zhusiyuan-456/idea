package com.siyuan.spring.IOC;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class MyClassPassXmlApplicationContext implements ApplicationContext {
    private Map<String, Object> ioc;


    public MyClassPassXmlApplicationContext(String path) {
        //parse xml file
        ioc = new HashMap<>();
        parseXml(path);
    }

    public void parseXml(String path) {
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read("src/main/resources/" + path);
            Element root = document.getRootElement();
            Iterator<Element> rootIter = root.elementIterator();
            while (rootIter.hasNext()) {
                Element bean = rootIter.next();
                String IdStr = bean.attributeValue("id");
                String className = bean.attributeValue("class");
                System.out.println(IdStr);
                System.out.println(className);
                Class clazz = Class.forName(className);
                System.out.println(clazz);

                Constructor constructor = clazz.getConstructor();

                Object object = constructor.newInstance();
                System.out.println(object);
                ioc.put(IdStr, object);
                Iterator<Element> beanIte = bean.elementIterator();
                while (beanIte.hasNext()) {
                    Element property = beanIte.next();
                    String propertyName = property.attributeValue("name");
                    String propertyValue = property.attributeValue("value");
                    //Get the getter method;
                    String methodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
                    System.out.println(methodName);
                    Method method = clazz.getMethod(methodName);

                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        }  catch(IllegalAccessException e) {
            e.printStackTrace();
        }  catch(InvocationTargetException e){
                    e.printStackTrace();
                }
             catch(NoSuchMethodException e){
                    e.printStackTrace();
                }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
         catch(DocumentException e){
                        e.printStackTrace();
                    }
                }

                @Override
                public String getId () {
                    return null;
                }

                @Override
                public String getApplicationName () {
                    return null;
                }

                @Override
                public String getDisplayName () {
                    return null;
                }

                @Override
                public long getStartupDate () {
                    return 0;
                }

                @Override
                public ApplicationContext getParent () {
                    return null;
                }

                @Override
                public AutowireCapableBeanFactory getAutowireCapableBeanFactory () throws IllegalStateException {
                    return null;
                }

                @Override
                public BeanFactory getParentBeanFactory () {
                    return null;
                }

                @Override
                public boolean containsLocalBean (String s){
                    return false;
                }

                @Override
                public boolean containsBeanDefinition (String s){
                    return false;
                }

                @Override
                public int getBeanDefinitionCount () {
                    return 0;
                }

                @Override
                public String[] getBeanDefinitionNames () {
                    return new String[0];
                }

                @Override
                public <T > ObjectProvider < T > getBeanProvider(Class < T > aClass, boolean b){
                    return null;
                }

                @Override
                public <T > ObjectProvider < T > getBeanProvider(ResolvableType resolvableType, boolean b){
                    return null;
                }

                @Override
                public String[] getBeanNamesForType (ResolvableType resolvableType){
                    return new String[0];
                }

                @Override
                public String[] getBeanNamesForType (ResolvableType resolvableType,boolean b, boolean b1){
                    return new String[0];
                }

                @Override
                public String[] getBeanNamesForType (Class < ? > aClass){
                    return new String[0];
                }

                @Override
                public String[] getBeanNamesForType (Class < ? > aClass,boolean b, boolean b1){
                    return new String[0];
                }

                @Override
                public <T > Map < String, T > getBeansOfType(Class < T > aClass) throws BeansException {
                    return null;
                }

                @Override
                public <T > Map < String, T > getBeansOfType(Class < T > aClass, boolean b, boolean b1) throws
                BeansException {
                    return null;
                }

                @Override
                public String[] getBeanNamesForAnnotation (Class < ? extends Annotation > aClass){
                    return new String[0];
                }

                @Override
                public Map<String, Object> getBeansWithAnnotation (Class < ? extends Annotation > aClass) throws
                BeansException {
                    return null;
                }

                @Override
                public <A extends Annotation > A findAnnotationOnBean(String s, Class < A > aClass) throws
                NoSuchBeanDefinitionException {
                    return null;
                }

                @Override
                public Object getBean (String s) throws BeansException {
                    return ioc.get(s);
                }

                @Override
                public <T > T getBean(String s, Class < T > aClass) throws BeansException {
                    return null;
                }

                @Override
                public Object getBean (String s, Object...objects) throws BeansException {
                    return null;
                }

                @Override
                public <T > T getBean(Class < T > aClass) throws BeansException {
                    return null;
                }

                @Override
                public <T > T getBean(Class < T > aClass, Object...objects) throws BeansException {
                    return null;
                }

                @Override
                public <T > ObjectProvider < T > getBeanProvider(Class < T > aClass) {
                    return null;
                }

                @Override
                public <T > ObjectProvider < T > getBeanProvider(ResolvableType resolvableType) {
                    return null;
                }

                @Override
                public boolean containsBean (String s){
                    return false;
                }

                @Override
                public boolean isSingleton (String s) throws NoSuchBeanDefinitionException {
                    return false;
                }

                @Override
                public boolean isPrototype (String s) throws NoSuchBeanDefinitionException {
                    return false;
                }

                @Override
                public boolean isTypeMatch (String s, ResolvableType resolvableType) throws
                NoSuchBeanDefinitionException {
                    return false;
                }

                @Override
                public boolean isTypeMatch (String s, Class < ?>aClass) throws NoSuchBeanDefinitionException {
                    return false;
                }

                @Override
                public Class<?> getType (String s) throws NoSuchBeanDefinitionException {
                    return null;
                }

                @Override
                public Class<?> getType (String s,boolean b) throws NoSuchBeanDefinitionException {
                    return null;
                }

                @Override
                public String[] getAliases (String s){
                    return new String[0];
                }

                @Override
                public void publishEvent (Object o){

                }

                @Override
                public String getMessage (String s, Object[]objects, String s1, Locale locale){
                    return null;
                }

                @Override
                public String getMessage (String s, Object[]objects, Locale locale) throws NoSuchMessageException {
                    return null;
                }

                @Override
                public String getMessage (MessageSourceResolvable messageSourceResolvable, Locale locale) throws
                NoSuchMessageException {
                    return null;
                }

                @Override
                public Environment getEnvironment () {
                    return null;
                }

                @Override
                public Resource[] getResources (String s) throws IOException {
                    return new Resource[0];
                }

                @Override
                public Resource getResource (String s){
                    return null;
                }

                @Override
                public ClassLoader getClassLoader () {
                    return null;
                }
            }
