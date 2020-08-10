package hagan.web.photo.extentions

import android.Manifest
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.ContextWrapper
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Point
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Base64
import android.util.Base64OutputStream
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity


import com.tbruyelle.rxpermissions2.RxPermissions

import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileInputStream
import javax.sql.DataSource

/**
 * 图片转base64
 * @receiver File?
 * @return String
 */
fun File?.convertImageFileToBase64(): String {
    return FileInputStream(this).use { inputStream ->
        ByteArrayOutputStream().use { outputStream ->
            Base64OutputStream(outputStream, Base64.NO_WRAP).use { base64FilterStream ->
                inputStream.copyTo(base64FilterStream)
                base64FilterStream.close()
                outputStream.toString()
            }
        }
    }
}
