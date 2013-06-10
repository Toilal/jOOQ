/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TExoticTypesDao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord, org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes, java.lang.Integer> {

	/**
	 * Create a new TExoticTypesDao without any configuration
	 */
	public TExoticTypesDao() {
		super(org.jooq.test.mysql.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes.class);
	}

	/**
	 * Create a new TExoticTypesDao with an attached configuration
	 */
	public TExoticTypesDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.mysql.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TExoticTypes.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.mysql.generatedclasses.tables.TExoticTypes.ID, value);
	}

	/**
	 * Fetch records that have <code>UU IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes> fetchByUu(java.util.UUID... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TExoticTypes.UU, values);
	}
}