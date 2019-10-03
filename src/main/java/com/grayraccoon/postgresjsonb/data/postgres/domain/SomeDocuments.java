package com.grayraccoon.postgresjsonb.data.postgres.domain;

import com.grayraccoon.postgresjsonb.domain.WellDefinedJson;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "some_documents")
@NamedQueries({
        @NamedQuery(name = "SomeDocuments.findAll", query = "SELECT sd FROM SomeDocuments sd")})
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class SomeDocuments implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @org.hibernate.annotations.Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "some_documents_id", nullable = false, updatable = false, length = 42)
    private UUID someDocumentsId;

    @Size(min = 1, max = 100)
    @Column(name = "some_value", length = 100)
    private String someValue;

    @Type(type = "jsonb")
    @Column(name = "some_well_defined_json", columnDefinition = "jsonb")
    private WellDefinedJson someWellDefinedJson;

    @Type(type = "jsonb")
    @Column(name = "some_custom_json", columnDefinition = "jsonb")
    private Map<String, String> someCustomJson;

    @Type(type = "jsonb")
    @Column(name = "some_well_defined_json_array", columnDefinition = "jsonb")
    private List<WellDefinedJson> someWellDefinedJsonArray;

    @Type(type = "jsonb")
    @Column(name = "some_custom_json_array", columnDefinition = "jsonb")
    private List<Map<String, String>> someCustomJsonArray;

}
