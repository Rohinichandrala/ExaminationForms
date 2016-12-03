/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sine90.forms;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author rohini
 */
public class WritingTestParameters {
    
    public static HashMap<String,String> pre_test_params=new HashMap<String,String>();
    public static HashMap<String,String> post_test_params=new HashMap<String,String>();
    public static HashMap<String,String> qa_pre_test_params=new HashMap<String,String>();
    public static HashMap<String,String> qa_post_test_params=new HashMap<String,String>();
    public static HashMap<String,ArrayList<String>> pre_test_answers=new HashMap<String, ArrayList<String>>();
    public static HashMap<String,ArrayList<String>> post_test_answers=new HashMap<String, ArrayList<String>>();
    private static ArrayList<ArrayList<String>> pre_test_array=new ArrayList<ArrayList<String>>();
    private static ArrayList<ArrayList<String>> post_test_array=new ArrayList<ArrayList<String>>();
    
    static{
    pre_test_params.put("quest1","Which / stolen / is / was/ the / mine / bag/./");
    pre_test_params.put("quest2","Go / do / to / you / school / when /?/");
    pre_test_params.put("quest3","Despite /walked / old woman / . / very / the / her / age / quickly");
    pre_test_params.put("quest4","Completed / . / social / studies/ I/ project/ haven’t / my/");
    pre_test_params.put("quest5","Lunch / pack / ? / box / the / dad /he / didn’t / did/");
    pre_test_params.put("quest6","Advancements/ Fascinated / . / children/ by/ are / technology/ in");
    post_test_params.put("quest1","Understand/ I / weird/ don’t / . /behavior / his/");
    post_test_params.put("quest2","Isn’t / he / brilliant / he / is /? /");
    post_test_params.put("quest3","Hates/ ? / doesn’t / she / apples / she/");
    post_test_params.put("quest4","Diversity / India / known/ for / is / . /unity/ in/");
    post_test_params.put("quest5","/ ./ Malaysian Airlines/ blasted/ the / belonged / mid-air/ to / which / jet /");
    post_test_params.put("quest6","Place / ? / you / would / vacation / this / which / visiting / be /");
    qa_pre_test_params.put("topic1","Write about the festival that you enjoy most.");
    qa_pre_test_params.put("topic2","Write about yourself.");
    qa_pre_test_params.put("topic3","What are your aims and goals in life and how do you achieve them?");
    qa_pre_test_params.put("topic4","What is the movie that you liked most and why?");
    qa_pre_test_params.put("topic5","What is the one motivating/inspiring experience in your life and why?");
    qa_post_test_params.put("topic1","Explain the features of any electronic device that you prefer most.");
    qa_post_test_params.put("topic2","Do you like the idea of Swachh Bharat Abhiyan and what is your contribution towards it?");
    qa_post_test_params.put("topic3","Which role model / personality has influenced you most and how?");
    qa_post_test_params.put("topic4","Explain the role of the teacher in your life?");
    qa_post_test_params.put("topic5","Give your suggestions to develop the state with regard to education and go green program");
//    pre_test_array.add("the");pre_test_array.add("bag");pre_test_array.add("which");pre_test_array.add("was");pre_test_array.add("stolen");pre_test_array.add("is");pre_test_array.add("mine");
//    pre_test_answers.put("answer1",pre_test_array);
    
    }
    
}
