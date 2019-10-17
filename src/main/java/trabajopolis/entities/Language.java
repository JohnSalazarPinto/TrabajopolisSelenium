/*
 * @(#) Language.java Copyright (c) 2019 Jala Foundation.
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
 * Language class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class Language {
    private String language;
    private String writingLevel;
    private String speakingLevel;
    private String readingLevel;

    /**
     * Gets user language.
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets user language from user form.
     * @param language - User language
     */
    public void setLanguage(final String language) {
        this.language = language;
    }

    /**
     * Gets user reading level.
     * @return readingLevel - Phrase complete for assert.
     */
    public String getReadingLevel() {
        return "Nivel Lectura: " + readingLevel;
    }

    /**
     * Sets user read level from the form.
     * @param readingLevel - User reading level
     */
    public void setReadingLevel(final String readingLevel) {
        this.readingLevel = readingLevel;
    }

    /**
     * Gets user complete phrase write level.
     * @return writingLevel
     */
    public String getWritingLevel() {
        return "Nivel Escrito: " + writingLevel;
    }

    /**
     * Sets user write level.
     * @param writingLevel - User writing level
     */
    public void setWritingLevel(final String writingLevel) {
        this.writingLevel = writingLevel;
    }

    /**
     * Gets complete phrase user speak level.
     * @return speakingLevel.
     */
    public String getSpeakingLevel() {
        return "Nivel Oral: " + speakingLevel;
    }

    /**
     * Sets user speak level.
     * @param speakingLevel - User speaking level
     */
    public void setSpeakingLevel(final String speakingLevel) {
        this.speakingLevel = speakingLevel;
    }
}
