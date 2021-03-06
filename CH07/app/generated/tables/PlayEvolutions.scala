/**
 * This class is generated by jOOQ
 */
package generated.tables


import generated.Keys
import generated.Public
import generated.tables.records.PlayEvolutionsRecord

import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.sql.Timestamp
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object PlayEvolutions {

	/**
	 * The reference instance of <code>public.play_evolutions</code>
	 */
	val PLAY_EVOLUTIONS = new PlayEvolutions
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	),
	comments = "This class is generated by jOOQ"
)
class PlayEvolutions(alias : String, aliased : Table[PlayEvolutionsRecord], parameters : Array[ Field[_] ]) extends TableImpl[PlayEvolutionsRecord](alias, Public.PUBLIC, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[PlayEvolutionsRecord] = {
		classOf[PlayEvolutionsRecord]
	}

	/**
	 * The column <code>public.play_evolutions.id</code>.
	 */
	val ID : TableField[PlayEvolutionsRecord, Integer] = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

	/**
	 * The column <code>public.play_evolutions.hash</code>.
	 */
	val HASH : TableField[PlayEvolutionsRecord, String] = createField("hash", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), "")

	/**
	 * The column <code>public.play_evolutions.applied_at</code>.
	 */
	val APPLIED_AT : TableField[PlayEvolutionsRecord, Timestamp] = createField("applied_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), "")

	/**
	 * The column <code>public.play_evolutions.apply_script</code>.
	 */
	val APPLY_SCRIPT : TableField[PlayEvolutionsRecord, String] = createField("apply_script", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>public.play_evolutions.revert_script</code>.
	 */
	val REVERT_SCRIPT : TableField[PlayEvolutionsRecord, String] = createField("revert_script", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * The column <code>public.play_evolutions.state</code>.
	 */
	val STATE : TableField[PlayEvolutionsRecord, String] = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), "")

	/**
	 * The column <code>public.play_evolutions.last_problem</code>.
	 */
	val LAST_PROBLEM : TableField[PlayEvolutionsRecord, String] = createField("last_problem", org.jooq.impl.SQLDataType.CLOB, "")

	/**
	 * Create a <code>public.play_evolutions</code> table reference
	 */
	def this() = {
		this("play_evolutions", null, null)
	}

	/**
	 * Create an aliased <code>public.play_evolutions</code> table reference
	 */
	def this(alias : String) = {
		this(alias, generated.tables.PlayEvolutions.PLAY_EVOLUTIONS, null)
	}

	private def this(alias : String, aliased : Table[PlayEvolutionsRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[PlayEvolutionsRecord] = {
		Keys.PLAY_EVOLUTIONS_PKEY
	}

	override def getKeys : List[ UniqueKey[PlayEvolutionsRecord] ] = {
		return Arrays.asList[ UniqueKey[PlayEvolutionsRecord] ](Keys.PLAY_EVOLUTIONS_PKEY)
	}

	override def as(alias : String) : PlayEvolutions = {
		new PlayEvolutions(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : PlayEvolutions = {
		new PlayEvolutions(name, null)
	}
}
