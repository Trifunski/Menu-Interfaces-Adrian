package Clases;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.simple.JSONArray;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.json.simple.JSONObject;

/**
 *
 * @author Trifunski 
 */

public class AñadirPersona extends javax.swing.JPanel {
    
    ArrayList listaPersonas = new ArrayList<Persona>();
    JSONArray jsonArray = new JSONArray();
    TablaPersonas modeloDatosPersona = new TablaPersonas(listaPersonas);
    Boolean editando = false;
    int filaSeleccionada;

    public AñadirPersona() {
        initComponents();
        this.Tabla.setModel(modeloDatosPersona);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        PanelFormulario = new javax.swing.JPanel();
        LabelDNI = new javax.swing.JLabel();
        FieldDNI = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        LabelApellido1 = new javax.swing.JLabel();
        FieldApellido1 = new javax.swing.JTextField();
        LabelApellido2 = new javax.swing.JLabel();
        FieldApellido2 = new javax.swing.JTextField();
        LabelCorreo = new javax.swing.JLabel();
        FieldCorreo = new javax.swing.JTextField();
        LabelAñoNac = new javax.swing.JLabel();
        FieldAñoNac = new javax.swing.JTextField();
        LabelContra = new javax.swing.JLabel();
        FieldContra = new javax.swing.JPasswordField();
        BttnCancelar = new javax.swing.JButton();
        BttnAgregar = new javax.swing.JButton();
        PanelScroll = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ExportarJSON = new javax.swing.JButton();
        ExportarXML = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("FORMULARIO");

        PanelFormulario.setBackground(new java.awt.Color(0, 0, 0));
        PanelFormulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        LabelDNI.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelDNI.setForeground(new java.awt.Color(255, 255, 255));
        LabelDNI.setText("DNI");

        FieldDNI.setBackground(new java.awt.Color(255, 255, 255));
        FieldDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelNombre.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("NOMBRE");

        FieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        FieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });

        LabelApellido1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelApellido1.setForeground(new java.awt.Color(255, 255, 255));
        LabelApellido1.setText("APELLIDO1");

        FieldApellido1.setBackground(new java.awt.Color(255, 255, 255));
        FieldApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelApellido2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelApellido2.setForeground(new java.awt.Color(255, 255, 255));
        LabelApellido2.setText("APELLIDO2");

        FieldApellido2.setBackground(new java.awt.Color(255, 255, 255));
        FieldApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldApellido2ActionPerformed(evt);
            }
        });

        LabelCorreo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorreo.setText("CORREO");

        FieldCorreo.setBackground(new java.awt.Color(255, 255, 255));
        FieldCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelAñoNac.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelAñoNac.setForeground(new java.awt.Color(255, 255, 255));
        LabelAñoNac.setText("AÑO NACIMIENTO");

        FieldAñoNac.setBackground(new java.awt.Color(255, 255, 255));
        FieldAñoNac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelContra.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelContra.setForeground(new java.awt.Color(255, 255, 255));
        LabelContra.setText("CONTRASEÑA");

        FieldContra.setBackground(new java.awt.Color(255, 255, 255));
        FieldContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BttnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BttnCancelar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BttnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BttnCancelar.setText("CANCELAR");
        BttnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BttnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BttnCancelarMouseClicked(evt);
            }
        });
        BttnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnCancelarActionPerformed(evt);
            }
        });

        BttnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        BttnAgregar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BttnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        BttnAgregar.setText("AGREGAR");
        BttnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BttnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BttnAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelFormularioLayout = new javax.swing.GroupLayout(PanelFormulario);
        PanelFormulario.setLayout(PanelFormularioLayout);
        PanelFormularioLayout.setHorizontalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormularioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelCorreo)
                    .addComponent(LabelDNI))
                .addGap(18, 18, 18)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addComponent(FieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelNombre))
                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelApellido1))
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addComponent(LabelAñoNac)
                        .addGap(18, 18, 18)
                        .addComponent(FieldAñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addComponent(FieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelApellido2))
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addComponent(LabelContra)
                        .addGap(18, 18, 18)
                        .addComponent(FieldContra)))
                .addGap(18, 18, 18)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addComponent(BttnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(BttnAgregar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        PanelFormularioLayout.setVerticalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormularioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNombre)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelApellido1)
                    .addComponent(FieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelApellido2)
                    .addComponent(FieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCorreo)
                    .addComponent(LabelAñoNac)
                    .addComponent(FieldAñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelContra)
                    .addComponent(BttnCancelar)
                    .addComponent(BttnAgregar)
                    .addComponent(FieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Tabla.setBackground(new java.awt.Color(0, 0, 0));
        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        PanelScroll.setViewportView(Tabla);

        ExportarJSON.setBackground(new java.awt.Color(0, 0, 0));
        ExportarJSON.setForeground(new java.awt.Color(255, 255, 255));
        ExportarJSON.setText("  EXPORTAR JSON  ");
        ExportarJSON.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ExportarJSON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExportarJSON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExportarJSONMouseClicked(evt);
            }
        });

        ExportarXML.setBackground(new java.awt.Color(0, 0, 0));
        ExportarXML.setForeground(new java.awt.Color(255, 255, 255));
        ExportarXML.setText("  EXPORTAR XML  ");
        ExportarXML.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ExportarXML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExportarXML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExportarXMLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExportarXML)
                                .addGap(18, 18, 18)
                                .addComponent(ExportarJSON))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelScroll)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExportarJSON)
                    .addComponent(ExportarXML))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void FieldApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldApellido2ActionPerformed

    private void BttnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttnCancelarActionPerformed

    private void BttnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BttnCancelarMouseClicked
        limpiar();
        LabelDNI.setForeground(Color.WHITE);
        LabelNombre.setForeground(Color.WHITE);
        LabelApellido1.setForeground(Color.WHITE);
        LabelApellido2.setForeground(Color.WHITE);
        LabelAñoNac.setForeground(Color.WHITE);
        LabelCorreo.setForeground(Color.WHITE);
        LabelContra.setForeground(Color.WHITE);
    }//GEN-LAST:event_BttnCancelarMouseClicked

    private void BttnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BttnAgregarMouseClicked
        
        Persona persona = new Persona();
        
        if (FieldDNI.getText() == null) {
            JOptionPane.showMessageDialog(this, "No puede dejar los campos vacios", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            persona.setDNI(FieldDNI.getText());
            persona.setNombre(FieldNombre.getText());
            persona.setApellido1(FieldApellido1.getText());
            persona.setApellido2(FieldApellido2.getText());
            persona.setAñoNac(FieldAñoNac.getText());
            persona.setCorreo(FieldCorreo.getText());
            persona.setContraseña(Hash.md5(FieldContra.getText()));
        
            if (!editando) {        
                modeloDatosPersona.setPersona(persona);
                limpiar();
            } else {
                modeloDatosPersona.setValueRow(persona, filaSeleccionada);
                limpiar();
            } 
        }
        
    }//GEN-LAST:event_BttnAgregarMouseClicked

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        filaSeleccionada= this.Tabla.getSelectedRow(); 
        if (filaSeleccionada < 0){
           JOptionPane.showMessageDialog(this, "Debe selecionar alguna Fila", "error", JOptionPane.ERROR_MESSAGE);
          } else {
             editando = true;
             PanelFormulario.setBackground(Color.WHITE);
             LabelDNI.setForeground(Color.BLACK);
             LabelNombre.setForeground(Color.BLACK);
             LabelApellido1.setForeground(Color.BLACK);
             LabelApellido2.setForeground(Color.BLACK);
             LabelAñoNac.setForeground(Color.BLACK);
             LabelCorreo.setForeground(Color.BLACK);
             LabelContra.setForeground(Color.BLACK);
             BttnAgregar.setLabel("GUARDAR");
             cargarPersonas(filaSeleccionada);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void ExportarXMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportarXMLMouseClicked
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            var documento = implementation.createDocument(null, "personas", null);
            documento.setXmlVersion("1.0");
           
            Element personas = (Element)documento.createElement("personas");
        
            //Elemento hijo de personas.
            for(int i=0;i<this.listaPersonas.size();i++){
                var p = listaPersonas.get(i);
                Persona ps = (Persona) p;
                Element persona = (Element) documento.getDocumentElement();

                //Elementos hijos de persona.
                Element Nombre = (Element) documento.createElement("Nombre");
                Nombre.appendChild(documento.createTextNode(ps.getNombre()));
                persona.appendChild(Nombre);

                Element Apellido1 = (Element) documento.createElement("Apellido1");
                Apellido1.appendChild(documento.createTextNode(ps.getApellido1()));
                persona.appendChild(Apellido1);

                Element Apellido2 = (Element) documento.createElement("Apellido2");
                Apellido2.appendChild(documento.createTextNode(ps.getApellido2()));
                persona.appendChild(Apellido2);

                Element DNI = (Element) documento.createElement("DNI");
                DNI.appendChild(documento.createTextNode(ps.getDNI()));
                persona.appendChild(DNI);

                Element FechaNacimiento = (Element) documento.createElement("FechaNacimiento");
                FechaNacimiento.appendChild(documento.createTextNode(ps.getAñoNac()));
                persona.appendChild(FechaNacimiento);

                Element Correo = (Element) documento.createElement("Correo");
                Correo.appendChild(documento.createTextNode(ps.getCorreo()));
                persona.appendChild(Correo);

                Element Contraseña = (Element) documento.createElement("Password");
                Contraseña.appendChild(documento.createTextNode(ps.getContraseña()));
                persona.appendChild(Contraseña);
            }
            
            documento.getDocumentElement().appendChild(personas);
            
            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("Personas.xml"));
            
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            
            System.out.println("Creado");
            
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ExportarXMLMouseClicked

    private void ExportarJSONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportarJSONMouseClicked
        crearpersonaJson();
    }//GEN-LAST:event_ExportarJSONMouseClicked

    private void crearpersonaJson(){
        
        for(int i = 0; i < this.listaPersonas.size(); i++){
            var p = listaPersonas.get(i);
            Persona persona = (Persona) p;
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ID",persona.getDNI());
            jsonObject.put("Nombre",persona.getNombre());
            jsonObject.put("Apellido1", persona.getApellido1());
            jsonObject.put("Apellido2", persona.getApellido2());
            jsonObject.put("Año de nacimiento", persona.getAñoNac());
            jsonObject.put("Correo", persona.getCorreo());
            jsonObject.put("Password", persona.getContraseña());
            jsonArray.add(jsonObject);
        }
        
        try {
            FileWriter fileWriter = new FileWriter("Persona.json");
            fileWriter.write(jsonArray.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void limpiar() {
        this.FieldNombre.setText("");
        this.FieldApellido1.setText("");
        this.FieldApellido2.setText("");
        this.FieldAñoNac.setText("");
        this.FieldDNI.setText("");
        this.FieldCorreo.setText("");
        this.FieldContra.setText("");
        if (editando) {
            BttnAgregar.setLabel("AGREGAR");
            PanelFormulario.setBackground(Color.BLACK);
            editando = false;
        }
    }
    
    private void cargarPersonas(int filaSeleccionada) {
        var persona = (Persona) this.listaPersonas.get(filaSeleccionada);
        this.FieldDNI.setText(persona.getDNI());
        this.FieldNombre.setText(persona.getNombre());
        this.FieldApellido1.setText(persona.getApellido1());
        this.FieldApellido2.setText(persona.getApellido2());
        this.FieldAñoNac.setText(persona.getAñoNac());
        this.FieldCorreo.setText(persona.getCorreo());
        // this.FieldContra.setText(persona.getContraseña());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttnAgregar;
    private javax.swing.JButton BttnCancelar;
    private javax.swing.JButton ExportarJSON;
    private javax.swing.JButton ExportarXML;
    private javax.swing.JTextField FieldApellido1;
    private javax.swing.JTextField FieldApellido2;
    private javax.swing.JTextField FieldAñoNac;
    private javax.swing.JPasswordField FieldContra;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDNI;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JLabel LabelApellido1;
    private javax.swing.JLabel LabelApellido2;
    private javax.swing.JLabel LabelAñoNac;
    private javax.swing.JLabel LabelContra;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDNI;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JPanel PanelFormulario;
    private javax.swing.JScrollPane PanelScroll;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables

    private VentanaInicio VentanaInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
