/*
 * @(#) Context.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package trabajopolis.entities;

/**
 * Context class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Context {
    private Search search;
    private Curriculum curriculum;

    /**
     * Constructs all elements in the context.
     */
    public Context() {
        this.search = new Search();
        this.curriculum = new Curriculum();
    }

    /**
     * Allows to get context's search.
     *
     * @return - search .
     */
    public Search getSearch() {
        return search;
    }

    /**
     * Allows to get context's curriculum.
     *
     * @return - curriculum.
     */
    public Curriculum getCurriculum() {
        return curriculum;
    }
}
