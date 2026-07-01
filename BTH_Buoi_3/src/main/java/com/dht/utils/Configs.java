/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.utils;

import com.dht.services.CategoryServices;
import com.dht.services.LevelServices;
import com.dht.services.question.QuestionServices;
import com.dht.services.question.UpdateQuestionServices;

/**
 *
 * @author admin
 */
public class Configs {

    public static final CategoryServices CATEGORY_SERVICES = new CategoryServices();
    public static final QuestionServices QUESTION_SERVICES = new QuestionServices();
    public static final LevelServices LEVEL_SERVICES = new LevelServices();
    public static final UpdateQuestionServices UPDATE_QS = new UpdateQuestionServices();
}
