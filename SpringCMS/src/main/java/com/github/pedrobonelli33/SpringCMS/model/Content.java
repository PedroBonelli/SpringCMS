package com.github.pedrobonelli33.SpringCMS.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Contents")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String data;

    @Enumerated(value = EnumType.STRING)
    private ContentType contentType;

//    @Column(name = "pageId")
//    private long pageId;

    @ManyToOne
    @JoinColumn(name = "pageId")
    private ContentPage page;
}
