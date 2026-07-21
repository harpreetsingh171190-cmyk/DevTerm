package com.devterm.system

object CapabilityReport {

    fun report():String{

        return buildString{

            append("DevTerm Capability Report\n\n")

            SystemCapability.features().forEach{

                append(
                    if(it.available)
                        "✅ ${it.name}\n"
                    else
                        "🔒 ${it.name}\n"
                )

            }

        }

    }

}
