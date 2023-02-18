package com.datvutech.jpwh.part2._4_mappingclass.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Immutable // no public setter methods for any properties (all set in constructor)
@Table(name = "_4_bids")
@Entity
public class Bid implements Serializable {

}
