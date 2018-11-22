package com.nestvision.nest.proxy.transform;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.IOUtils;

import com.nestvision.nest.proxy.transform.model.NestMessage;

public class Transformers {

    private Transformers() {

    }

    public static <T> T transformFromBytes(byte[] bytes, Class<T> clazz) throws TransformException {
        ByteArrayInputStream input = null;
        ObjectInputStream ois = null;
        try {
            input = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(input);
            return (T) ois.readObject();
        } catch (Exception e) {
            throw new TransformException(e);
        } finally {
            IOUtils.closeQuietly(input);
            IOUtils.closeQuietly(ois);

        }
    }

    public static <T extends Collection<E>, E> Collection<E> transformCollectionFromBase64Bytes(byte[] base64, Class<T> clazz)
                    throws TransformException {
        return transformFromBase64Bytes(base64, clazz);

    }

    public static <T> T transformFromBase64Bytes(byte[] base64, Class<T> clazz) throws TransformException {

        byte[] bytes = Base64.getDecoder().decode(base64);
        return transformFromBytes(bytes, clazz);

    }

    public static byte[] transformToBase64Bytes(Object obj) throws TransformException {
        ByteArrayOutputStream out = null;
        ObjectOutputStream oos = null;
        try {
            out = new ByteArrayOutputStream();

            oos = new ObjectOutputStream(out);

            oos.writeObject(obj);
            byte[] bytes = out.toByteArray();
            return Base64.getEncoder().encode(bytes);
        } catch (Exception e) {
            throw new TransformException(e);
        } finally {

            try {
                if (out != null) {
                    out.close();
                }
                if (oos != null) {
                    oos.close();
                }

            } catch (IOException e) {

                e.printStackTrace();
            }

        }
    }

    public static String transformToBase64(Object obj) throws TransformException {
        ByteArrayOutputStream out = null;
        ObjectOutputStream oos = null;
        try {
            out = new ByteArrayOutputStream();

            oos = new ObjectOutputStream(out);

            oos.writeObject(obj);
            byte[] bytes = out.toByteArray();
            return Base64.getEncoder().encodeToString(bytes);
        } catch (Exception e) {
            throw new TransformException(e);
        } finally {

            try {
                if (out != null) {
                    out.close();
                }
                if (oos != null) {
                    oos.close();
                }

            } catch (IOException e) {

                e.printStackTrace();
            }

        }

    }

    public static <T> T transformFromBase64(String base64, Class<T> clazz) throws TransformException {

        byte[] bytes = Base64.getDecoder().decode(base64);
        return transformFromBytes(bytes, clazz);

    }

    public static <T> T transformFromXml(byte[] bytes, Class<T> clazz) throws TransformException {
        ByteArrayInputStream input = new ByteArrayInputStream(bytes);
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            T result = (T) unmarshaller.unmarshal(input);
            return result;
        } catch (Exception e) {
            throw new TransformException(e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }

    public static byte[] transformToXml(Object object) throws TransformException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            JAXBContext context = JAXBContext.newInstance(NestMessage.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(object, out);
            return out.toByteArray();
        } catch (Exception e) {
            throw new TransformException(e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }
}
