/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public interface ITDates extends java.io.Serializable {

	/**
	 * The table column <code>PUBLIC.T_DATES.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.T_DATES.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId();

	/**
	 * The table column <code>PUBLIC.T_DATES.D</code>
	 */
	public void setD(java.sql.Date value);

	/**
	 * The table column <code>PUBLIC.T_DATES.D</code>
	 */
	public java.sql.Date getD();

	/**
	 * The table column <code>PUBLIC.T_DATES.T</code>
	 */
	public void setT(java.sql.Time value);

	/**
	 * The table column <code>PUBLIC.T_DATES.T</code>
	 */
	public java.sql.Time getT();

	/**
	 * The table column <code>PUBLIC.T_DATES.TS</code>
	 */
	public void setTs(java.sql.Timestamp value);

	/**
	 * The table column <code>PUBLIC.T_DATES.TS</code>
	 */
	public java.sql.Timestamp getTs();

	/**
	 * The table column <code>PUBLIC.T_DATES.D_INT</code>
	 */
	public void setDInt(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.T_DATES.D_INT</code>
	 */
	public java.lang.Integer getDInt();

	/**
	 * The table column <code>PUBLIC.T_DATES.TS_BIGINT</code>
	 */
	public void setTsBigint(java.lang.Long value);

	/**
	 * The table column <code>PUBLIC.T_DATES.TS_BIGINT</code>
	 */
	public java.lang.Long getTsBigint();

	/**
	 * The table column <code>PUBLIC.T_DATES.I_Y</code>
	 */
	public void setIY(org.jooq.types.YearToMonth value);

	/**
	 * The table column <code>PUBLIC.T_DATES.I_Y</code>
	 */
	public org.jooq.types.YearToMonth getIY();

	/**
	 * The table column <code>PUBLIC.T_DATES.I_D</code>
	 */
	public void setID(org.jooq.types.DayToSecond value);

	/**
	 * The table column <code>PUBLIC.T_DATES.I_D</code>
	 */
	public org.jooq.types.DayToSecond getID();
}