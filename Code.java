

import java.io.Serializable;

/**
 * Domain class for Code.
 */
public class Code
    implements Serializable
{

    private String  codeGroup;

    private String  code;

    private String  language;

    private String  description1;

    private String  description2;

    private String  description3;

    private String  description4;

    private String  description5;

    private Long numeric1;

    private Integer numeric2;

    private Integer numeric3;

    private Integer numeric4;

    private Integer numeric5;

    private String  created;

    private String  creator;

    private String  changed;

    private String  changer;
    
    private String empName;
    
    private String empid;

    /**
     * Sets code codegroup.
     * 
     * @param codeGroup New code codegroup
     */
    public void setCodeGroup(String codeGroup)
    {
        this.codeGroup = codeGroup;
    }

    /**
     * Gets code codegroup.
     * 
     * @return Code codegroup
     */
    public String getCodeGroup()
    {
        return codeGroup;
    }

    /**
     * Sets code code.
     * 
     * @param code New code code
     */
    public void setCode(String code)
    {
        this.code = code;
    }

    /**
     * Gets Code code.
     * 
     * @return Code code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Sets code language.
     * 
     * @param language New code language
     */
    public void setLanguage(String language)
    {
        this.language = language;
    }

    /**
     * Gets code language.
     * 
     * @return Code language
     */
    public String getLanguage()
    {
        return language;
    }

    /**
     * Sets code description1.
     * 
     * @param description1 New code description1
     */
    public void setDescription1(String description1)
    {
        this.description1 = description1;
    }

    /**
     * Gets code description1.
     * 
     * @return Code description1
     */
    public String getDescription1()
    {
        return description1;
    }

    public String getDescription2()
    {
        return description2;
    }

    public void setDescription2(String description2)
    {
        this.description2 = description2;
    }

    public String getDescription3()
    {
        return description3;
    }

    public void setDescription3(String description3)
    {
        this.description3 = description3;
    }

    public String getDescription4()
    {
        return description4;
    }

    public void setDescription4(String description4)
    {
        this.description4 = description4;
    }

    public String getDescription5()
    {
        return description5;
    }

    public void setDescription5(String description5)
    {
        this.description5 = description5;
    }

    public Long getNumeric1()
    {
        return numeric1;
    }

    public void setNumeric1(Long numeric1)
    {
        this.numeric1 = numeric1;
    }

    public Integer getNumeric2()
    {
        return numeric2;
    }

    public void setNumeric2(Integer numeric2)
    {
        this.numeric2 = numeric2;
    }

    public Integer getNumeric3()
    {
        return numeric3;
    }

    public void setNumeric3(Integer numeric3)
    {
        this.numeric3 = numeric3;
    }

    public Integer getNumeric4()
    {
        return numeric4;
    }

    public void setNumeric4(Integer numeric4)
    {
        this.numeric4 = numeric4;
    }

    public Integer getNumeric5()
    {
        return numeric5;
    }

    public void setNumeric5(Integer numeric5)
    {
        this.numeric5 = numeric5;
    }

    public String getChanged()
    {
        return changed;
    }

    public void setChanged(String changed)
    {
        this.changed = changed;
    }

    public String getChanger()
    {
        return changer;
    }

    public void setChanger(String changer)
    {
        this.changer = changer;
    }

    public String getCreated()
    {
        return created;
    }

    public void setCreated(String created)
    {
        this.created = created;
    }

    public String getCreator()
    {
        return creator;
    }

    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public boolean equals(Object obj)
    {
        return ((Code) obj).getCode().equals(code)
                && ((Code) obj).getCodeGroup().equals(codeGroup)
                && ((Code) obj).getLanguage().equals(language);
    }

    public int hashCode()
    {
        return super.hashCode();
    }

}
