<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <html>
            <body>
                <h1>Resource</h1>
                <table border="1">
                    <tr>
                        <th>id</th>
                        <th>category</th>
                        <th>title</th>
                        <th>author</th>
                        <th>url</th>
                        <th>date</th>
                    </tr>
                    <xsl:for-each select="resources/resource">
                        <tr>
                            <td>
                                <xsl:value-of select="id" />
                            </td>
                            <td>
                                <xsl:value-of select="category" />
                            </td>
                            <td>
                                <xsl:value-of select="title" />
                            </td>
                            <td>
                                <xsl:value-of select="author" />
                            </td>
                            <td>
                                <xsl:value-of select="url" />
                            </td>
                            <td>
                                <xsl:value-of select="date" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>