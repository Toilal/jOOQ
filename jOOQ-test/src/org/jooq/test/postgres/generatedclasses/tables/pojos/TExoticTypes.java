/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes implements org.jooq.test.postgres.generatedclasses.tables.interfaces.ITExoticTypes {

	private static final long serialVersionUID = 288641934;

	private final java.lang.Integer id;
	private final java.util.UUID    uu;
	private final java.lang.Object  js;

	public TExoticTypes(
		java.lang.Integer id,
		java.util.UUID    uu,
		java.lang.Object  js
	) {
		this.id = id;
		this.uu = uu;
		this.js = js;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.util.UUID getUu() {
		return this.uu;
	}

	@Override
	public java.lang.Object getJs() {
		return this.js;
	}
}
