/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mera_naam_dwaipayan
 */
@Entity
@Table(name = "questions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q")
    , @NamedQuery(name = "Questions.findById", query = "SELECT q FROM Questions q WHERE q.id = :id")
    , @NamedQuery(name = "Questions.findByUsername", query = "SELECT q FROM Questions q WHERE q.username = :username")
    , @NamedQuery(name = "Questions.findByType", query = "SELECT q FROM Questions q WHERE q.type = :type")
    , @NamedQuery(name = "Questions.findByContent", query = "SELECT q FROM Questions q WHERE q.content = :content")
    , @NamedQuery(name = "Questions.findByUpvotes", query = "SELECT q FROM Questions q WHERE q.upvotes = :upvotes")
    , @NamedQuery(name = "Questions.findByDownvotes", query = "SELECT q FROM Questions q WHERE q.downvotes = :downvotes")
    , @NamedQuery(name = "Questions.findByComments", query = "SELECT q FROM Questions q WHERE q.comments = :comments")
    , @NamedQuery(name = "Questions.findByPostedat", query = "SELECT q FROM Questions q WHERE q.postedat = :postedat")})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Username")
    private String username;
    @Size(max = 45)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Content")
    private String content;
    @Column(name = "Upvotes")
    private Integer upvotes;
    @Column(name = "Downvotes")
    private Integer downvotes;
    @Size(max = 45)
    @Column(name = "Comments")
    private String comments;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Posted_at")
    private String postedat;
    @JoinColumn(name = "id", referencedColumnName = "comment_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Comments comments1;

    public Questions() {
    }

    public Questions(Integer id) {
        this.id = id;
    }

    public Questions(Integer id, String username, String content, String postedat) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.postedat = postedat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public Integer getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPostedat() {
        return postedat;
    }

    public void setPostedat(String postedat) {
        this.postedat = postedat;
    }

    public Comments getComments1() {
        return comments1;
    }

    public void setComments1(Comments comments1) {
        this.comments1 = comments1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Questions[ id=" + id + " ]";
    }
    
}
