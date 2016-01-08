
package com.galaxies.andromeda.util;

import com.galaxies.andromeda.util.Texting.Message;

/**
 * Para mostrar el progreso de una actividad
 * @author Azael Reyes
 */
public interface Progress
{
    /**
     * Indica el estado actual de la actividad
     * @param progress indicador numerico el estado actual
     * @param message descripcion del paso realizado
     */
    public void setProgress(int progress, String message);
    
    /**
     * Se confirma la terminacion dela operacion
     * @param msg texto de confirmacion
     */
    public void finalized(Message msg);
    
    /**
     * Si por alguna razon falla la operación
     */
    public void fail(Throwable throwable);
}
