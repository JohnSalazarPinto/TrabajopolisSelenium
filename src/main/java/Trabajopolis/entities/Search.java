/*
 * @(#) Search.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package Trabajopolis.entities;

/**
 * Search class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Search {
    private String postedWithin;
    private String keyword;
    private String category;
    private String contract;
    private String city;

    public String getKeyword() {
        return keyword;
    }

    /**
     * Allows to set the name of the product.
     *
     * @param keyword - Name to be set.
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Allows to get the product's name.
     *
     * @return - category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Allows to set the name of the product.
     *
     * @param category - Name to be set.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Allows to get the product's name.
     *
     * @return - city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Allows to set the name of the product.
     *
     * @param city - Name to be set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Allows to get the product's name.
     *
     * @return - contract.
     */
    public String getContract() {
        return contract;
    }

    /**
     * Allows to set the name of the product.
     *
     * @param contract - Name to be set.
     */
    public void setContract(String contract) {
        switch (contract) {
            case "Full time":
                contract = "Tiempo Completo";
                break;
            case "Part time":
                contract = "Medio Tiempo";
                break;
            case "Contractor":
                contract = "Contratista";
                break;
            case "Intern":
                contract = "Pasantía";
                break;
            case "Seasonal":
                contract = "Temporal";
                break;
            default:
        }
        this.contract = contract;
    }

    /**
     * Allows to get the search time posted.
     *
     * @return - postedWithin.
     */
    public String getPostedWithin() {
        return postedWithin;
    }

    /**
     * Allows to set the time of was posted.
     *
     * @param postedWithin - Time to be set.
     */
    public void setPostedWithin(String postedWithin) {
        this.postedWithin = postedWithin;
    }
}
